(ns com.google.cloud.dlp.v2.stub.DlpServiceStubSettings$Builder
  "Builder for DlpServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2.stub DlpServiceStubSettings$Builder]))

(defn reidentify-content-settings
  "Returns the builder for the settings used for calls to reidentifyContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.ReidentifyContentRequest,com.google.privacy.dlp.v2.ReidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.reidentifyContentSettings))))

(defn inspect-content-settings
  "Returns the builder for the settings used for calls to inspectContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.InspectContentRequest,com.google.privacy.dlp.v2.InspectContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.inspectContentSettings))))

(defn get-stored-info-type-settings
  "Returns the builder for the settings used for calls to getStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.GetStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.getStoredInfoTypeSettings))))

(defn list-deidentify-templates-settings
  "Returns the builder for the settings used for calls to listDeidentifyTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listDeidentifyTemplatesSettings))))

(defn deidentify-content-settings
  "Returns the builder for the settings used for calls to deidentifyContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeidentifyContentRequest,com.google.privacy.dlp.v2.DeidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deidentifyContentSettings))))

(defn cancel-dlp-job-settings
  "Returns the builder for the settings used for calls to cancelDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CancelDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.cancelDlpJobSettings))))

(defn delete-deidentify-template-settings
  "Returns the builder for the settings used for calls to deleteDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deleteDeidentifyTemplateSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dlp.v2.stub.DlpServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dlp.v2.stub.DlpServiceStubSettings$Builder [^DlpServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-inspect-templates-settings
  "Returns the builder for the settings used for calls to listInspectTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.privacy.dlp.v2.ListInspectTemplatesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listInspectTemplatesSettings))))

(defn create-dlp-job-settings
  "Returns the builder for the settings used for calls to createDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CreateDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.createDlpJobSettings))))

(defn get-job-trigger-settings
  "Returns the builder for the settings used for calls to getJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.GetJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.getJobTriggerSettings))))

(defn delete-inspect-template-settings
  "Returns the builder for the settings used for calls to deleteInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeleteInspectTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deleteInspectTemplateSettings))))

(defn update-deidentify-template-settings
  "Returns the builder for the settings used for calls to updateDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.updateDeidentifyTemplateSettings))))

(defn list-dlp-jobs-settings
  "Returns the builder for the settings used for calls to listDlpJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.privacy.dlp.v2.ListDlpJobsResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listDlpJobsSettings))))

(defn update-stored-info-type-settings
  "Returns the builder for the settings used for calls to updateStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.updateStoredInfoTypeSettings))))

(defn update-job-trigger-settings
  "Returns the builder for the settings used for calls to updateJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.UpdateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.updateJobTriggerSettings))))

(defn build
  "returns: `com.google.cloud.dlp.v2.stub.DlpServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dlp.v2.stub.DlpServiceStubSettings [^DlpServiceStubSettings$Builder this]
    (-> this (.build))))

(defn get-deidentify-template-settings
  "Returns the builder for the settings used for calls to getDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.getDeidentifyTemplateSettings))))

(defn get-dlp-job-settings
  "Returns the builder for the settings used for calls to getDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.GetDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.getDlpJobSettings))))

(defn list-stored-info-types-settings
  "Returns the builder for the settings used for calls to listStoredInfoTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.privacy.dlp.v2.ListStoredInfoTypesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listStoredInfoTypesSettings))))

(defn update-inspect-template-settings
  "Returns the builder for the settings used for calls to updateInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.UpdateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.updateInspectTemplateSettings))))

(defn delete-dlp-job-settings
  "Returns the builder for the settings used for calls to deleteDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeleteDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deleteDlpJobSettings))))

(defn get-inspect-template-settings
  "Returns the builder for the settings used for calls to getInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.GetInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.getInspectTemplateSettings))))

(defn delete-job-trigger-settings
  "Returns the builder for the settings used for calls to deleteJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeleteJobTriggerRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deleteJobTriggerSettings))))

(defn redact-image-settings
  "Returns the builder for the settings used for calls to redactImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.RedactImageRequest,com.google.privacy.dlp.v2.RedactImageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.redactImageSettings))))

(defn create-deidentify-template-settings
  "Returns the builder for the settings used for calls to createDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.createDeidentifyTemplateSettings))))

(defn create-job-trigger-settings
  "Returns the builder for the settings used for calls to createJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CreateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.createJobTriggerSettings))))

(defn list-info-types-settings
  "Returns the builder for the settings used for calls to listInfoTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.ListInfoTypesRequest,com.google.privacy.dlp.v2.ListInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listInfoTypesSettings))))

(defn create-stored-info-type-settings
  "Returns the builder for the settings used for calls to createStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.createStoredInfoTypeSettings))))

(defn list-job-triggers-settings
  "Returns the builder for the settings used for calls to listJobTriggers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.privacy.dlp.v2.ListJobTriggersResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.listJobTriggersSettings))))

(defn delete-stored-info-type-settings
  "Returns the builder for the settings used for calls to deleteStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.deleteStoredInfoTypeSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DlpServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-inspect-template-settings
  "Returns the builder for the settings used for calls to createInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.privacy.dlp.v2.CreateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DlpServiceStubSettings$Builder this]
    (-> this (.createInspectTemplateSettings))))

