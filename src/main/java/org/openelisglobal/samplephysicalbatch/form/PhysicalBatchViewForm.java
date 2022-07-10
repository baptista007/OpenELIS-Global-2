package org.openelisglobal.samplephysicalbatch.form;

import java.util.List;

import org.openelisglobal.common.form.BaseForm;
import org.openelisglobal.common.util.IdValuePair;

public class PhysicalBatchViewForm extends BaseForm {
	public enum SearchType {
        IDENTIFIER, DATE_STATUS
    }

    private String batchNumber;

    private String userSearch;

    private String organizationSearch;

    private String typeOfSample;

    private String testId;

    private SearchType searchType;

    private boolean searchFinished;

    private boolean useAllInfo;

    private String searchValue;

    private String startDate;

    private String endDate;

    private List<String> facilityIds;

    private List<String> testIds;

    private String statusId;

    private List<IdValuePair> referralFacilitySelectionList;

    private List<IdValuePair> testSelectionList;

    private List<IdValuePair> statusSelectionList;

    public PhysicalBatchViewForm() {
        setFormName("PhysicalBatchSearchForm");
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public List<IdValuePair> getReferralFacilitySelectionList() {
        return referralFacilitySelectionList;
    }

    public void setReferralFacilitySelectionList(List<IdValuePair> referralFacilitySelectionList) {
        this.referralFacilitySelectionList = referralFacilitySelectionList;
    }

    public List<IdValuePair> getTestSelectionList() {
        return testSelectionList;
    }

    public void setTestSelectionList(List<IdValuePair> testSelectionList) {
        this.testSelectionList = testSelectionList;
    }

    public List<IdValuePair> getStatusSelectionList() {
        return statusSelectionList;
    }

    public void setStatusSelectionList(List<IdValuePair> statusSelectionList) {
        this.statusSelectionList = statusSelectionList;
    }

    public List<String> getTestIds() {
        return testIds;
    }

    public void setTestIds(List<String> testIds) {
        this.testIds = testIds;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getUserSearch() {
        return userSearch;
    }

    public void setUserSearch(String userSearch) {
        this.userSearch = userSearch;
    }

    public String getOrganizationSearch() {
        return organizationSearch;
    }

    public void setOrganizationSearch(String organizationSearch) {
        this.organizationSearch = organizationSearch;
    }

    public String getTestId() {
        return this.testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTypeOfSample() {
        return this.typeOfSample;
    }

    public void setTypeOfSample(String typeOfSample) {
        this.typeOfSample = typeOfSample;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatus(String status) {
        this.statusId = status;
    }

    public List<String> getFacilityIds() {
        return facilityIds;
    }

    public void setFacilityIds(List<String> facilityIds) {
        this.facilityIds = facilityIds;
    }

    public boolean isSearchFinished() {
        return searchFinished;
    }

    public void setSearchFinished(boolean searchFinished) {
        this.searchFinished = searchFinished;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public boolean getUseAllInfo() {
        return useAllInfo;
    }

    public void setUseAllInfo(boolean useAllInfo) {
        this.useAllInfo = useAllInfo;
    }
}
