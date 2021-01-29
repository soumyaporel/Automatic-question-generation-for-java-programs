package org.opencms.ade.galleries;
import org.opencms.ade.containerpage.shared.CmsContainerElement;
import org.opencms.ade.galleries.CmsGalleryFilteredNavTreeBuilder.NavigationNode;
import org.opencms.ade.galleries.preview.I_CmsPreviewProvider;
import org.opencms.ade.galleries.shared.CmsGalleryConfiguration;
import org.opencms.file.types.CmsResourceTypeBinary;
import org.opencms.file.types.CmsResourceTypeImage;
import org.opencms.file.types.CmsResourceTypePointer;
import org.opencms.file.types.CmsResourceTypeXmlContainerPage;
import org.opencms.file.types.CmsResourceTypeXmlContent;
import org.opencms.file.types.CmsResourceTypeXmlPage;
import org.opencms.file.types.I_CmsResourceType;
private CmsResultItemBean buildSingleSearchResultItem(
            }
        }

        if (CmsGwtConstants.TYPE_MODELGROUP.equals(type.getTypeName())) {
            CmsProperty tempElementsProp = cms.readPropertyObject(
                resultResource,
                CmsPropertyDefinition.PROPERTY_TEMPLATE_ELEMENTS,
                false);
            if (tempElementsProp.isNullProperty()
                || !CmsContainerElement.USE_AS_COPY_MODEL.equals(tempElementsProp.getValue())) {
                bean.setPseudoType(CmsGwtConstants.TYPE_MODELGROUP_REUSE);
            }
        if (CmsResourceTypeXmlContainerPage.isModelReuseGroup(cms, resultResource)) {
            bean.setPseudoType(CmsGwtConstants.TYPE_MODELGROUP_REUSE);
        }

        bean.setResourceState(resultResource.getState());