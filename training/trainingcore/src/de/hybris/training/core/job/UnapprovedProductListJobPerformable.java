package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.training.core.model.UnapprovedProductListCronJobModel;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class UnapprovedProductListJobPerformable extends AbstractJobPerformable<UnapprovedProductListCronJobModel> {
    private FlexibleSearchService flexibleSearchService;
    private static final Logger log = Logger.getLogger(UnapprovedProductListJobPerformable.class.getName());

    @Override
    public PerformResult perform(UnapprovedProductListCronJobModel unapprovedProductListCronJobModel) {
        log.info("Started unapproved product list cronjob");
        try {
            List<ProductModel> unapprovedProducts = findUnapprovedProducts();
            logUnapprovedProductDetails(unapprovedProducts);
            log.info("Finished unapproved product list cronjob");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        } catch (Exception e){
            log.warning(e.getMessage());
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
        }
    }

    private void logUnapprovedProductDetails(List<ProductModel> unapprovedProducts) {
        for ( ProductModel product: unapprovedProducts) {
            String skuCode = product.getCode();
            Date creationTime = product.getCreationtime();
            String status = product.getApprovalStatus().toString();

            log.info("Product SKU: " + skuCode + " Product creation time: " + creationTime + " Product approval status: " + status);
        }
    }

    private List<ProductModel> findUnapprovedProducts() {
        String queryString = "SELECT {pk} FROM {product"
                               + " JOIN ArticleApprovalStatus ON {product:approvalstatus} = {ArticleApprovalStatus:pk}}"
                               + " WHERE {ArticleApprovalStatus:code} = 'unapproved'";
        FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<ProductModel>search(query).getResult();
    }

    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }
}
