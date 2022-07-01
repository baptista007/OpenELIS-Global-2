package org.openelisglobal.samplephysicalbatch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.openelisglobal.common.controller.BaseController;
import org.openelisglobal.common.services.DisplayListService;
import org.openelisglobal.common.services.DisplayListService.ListType;
import org.openelisglobal.samplephysicalbatch.form.PhysicalBatchSearchForm;
import org.openelisglobal.siteinformation.service.SiteInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SamplePhysicalBatchEntryController extends BaseController {

    private static final String[] ALLOWED_FIELDS = new String[] {};

    @Autowired
    SiteInformationService siteInformationService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields(ALLOWED_FIELDS);
    }
    
    @RequestMapping(value = "/SamplePhysicalBatchEntry", method = RequestMethod.GET)
    public ModelAndView showSamplePhysicalBatchEntry(HttpServletRequest request,
            @ModelAttribute("form") @Valid PhysicalBatchSearchForm form, BindingResult result) {
        form.setReferralFacilitySelectionList(
                DisplayListService.getInstance().getList(ListType.REFERRAL_ORGANIZATIONS));
        form.setTestSelectionList(DisplayListService.getInstance().getList(ListType.ORDERABLE_TESTS));
        form.setStatusSelectionList(DisplayListService.getInstance().getList(ListType.ELECTRONIC_ORDER_STATUSES));

//        if (form.getSearchType() != null) {
//            List<ElectronicOrder> electronicOrders;
//            List<ElectronicOrderDisplayItem> eOrderDisplayItems;
//
//            electronicOrders = electronicOrderService.searchForElectronicOrders(form);
//            eOrderDisplayItems = convertToDisplayItem(electronicOrders, form.getUseAllInfo());
//
//            form.setSearchFinished(true);
//            form.setEOrders(eOrderDisplayItems);
//        }

        return findForward(FWD_SUCCESS, form);
    }

    @Override
    protected String findLocalForward(String forward) {
        if (FWD_SUCCESS.equals(forward)) {
            return "samplePhysicalBatchListDefinition";
        } else if (FWD_FAIL.equals(forward)) {
            return "homePageDefinition";
        } else {
            return "PageNotFound";
        }
    }

    @Override
    protected String getPageTitleKey() {
        return "sample.physicalbatch.list.title";
    }

    @Override
    protected String getPageSubtitleKey() {
        return "sample.physicalbatch.list.title";
    }
}
