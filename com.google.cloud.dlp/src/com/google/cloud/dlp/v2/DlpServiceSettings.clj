(ns com.google.cloud.dlp.v2.DlpServiceSettings
  "Settings class to configure an instance of DlpServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (dlp.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of inspectContent to 30 seconds:



  DlpServiceSettings.Builder dlpServiceSettingsBuilder =
      DlpServiceSettings.newBuilder();
  dlpServiceSettingsBuilder.inspectContentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DlpServiceSettings dlpServiceSettings = dlpServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2 DlpServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DlpServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DlpServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DlpServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dlp.v2.DlpServiceSettings$Builder`"
  (^com.google.cloud.dlp.v2.DlpServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DlpServiceSettings/newBuilder client-context))
  (^com.google.cloud.dlp.v2.DlpServiceSettings$Builder []
    (DlpServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DlpServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dlp.v2.stub.DlpServiceStubSettings`

  returns: `com.google.cloud.dlp.v2.DlpServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dlp.v2.DlpServiceSettings [^com.google.cloud.dlp.v2.stub.DlpServiceStubSettings stub]
    (DlpServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DlpServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DlpServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DlpServiceSettings/getDefaultServiceScopes )))

(defn reidentify-content-settings
  "Returns the object with the settings used for calls to reidentifyContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.ReidentifyContentRequest,com.google.privacy.dlp.v2.ReidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.reidentifyContentSettings))))

(defn inspect-content-settings
  "Returns the object with the settings used for calls to inspectContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.InspectContentRequest,com.google.privacy.dlp.v2.InspectContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.inspectContentSettings))))

(defn get-stored-info-type-settings
  "Returns the object with the settings used for calls to getStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.GetStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.getStoredInfoTypeSettings))))

(defn list-deidentify-templates-settings
  "Returns the object with the settings used for calls to listDeidentifyTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DlpServiceSettings this]
    (-> this (.listDeidentifyTemplatesSettings))))

(defn deidentify-content-settings
  "Returns the object with the settings used for calls to deidentifyContent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeidentifyContentRequest,com.google.privacy.dlp.v2.DeidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deidentifyContentSettings))))

(defn cancel-dlp-job-settings
  "Returns the object with the settings used for calls to cancelDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CancelDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.cancelDlpJobSettings))))

(defn delete-deidentify-template-settings
  "Returns the object with the settings used for calls to deleteDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deleteDeidentifyTemplateSettings))))

(defn list-inspect-templates-settings
  "Returns the object with the settings used for calls to listInspectTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.privacy.dlp.v2.ListInspectTemplatesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DlpServiceSettings this]
    (-> this (.listInspectTemplatesSettings))))

(defn create-dlp-job-settings
  "Returns the object with the settings used for calls to createDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CreateDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.createDlpJobSettings))))

(defn get-job-trigger-settings
  "Returns the object with the settings used for calls to getJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.GetJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.getJobTriggerSettings))))

(defn delete-inspect-template-settings
  "Returns the object with the settings used for calls to deleteInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeleteInspectTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deleteInspectTemplateSettings))))

(defn update-deidentify-template-settings
  "Returns the object with the settings used for calls to updateDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.updateDeidentifyTemplateSettings))))

(defn list-dlp-jobs-settings
  "Returns the object with the settings used for calls to listDlpJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.privacy.dlp.v2.ListDlpJobsResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DlpServiceSettings this]
    (-> this (.listDlpJobsSettings))))

(defn update-stored-info-type-settings
  "Returns the object with the settings used for calls to updateStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.updateStoredInfoTypeSettings))))

(defn update-job-trigger-settings
  "Returns the object with the settings used for calls to updateJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.UpdateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.updateJobTriggerSettings))))

(defn get-deidentify-template-settings
  "Returns the object with the settings used for calls to getDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.getDeidentifyTemplateSettings))))

(defn get-dlp-job-settings
  "Returns the object with the settings used for calls to getDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.GetDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.getDlpJobSettings))))

(defn list-stored-info-types-settings
  "Returns the object with the settings used for calls to listStoredInfoTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.privacy.dlp.v2.ListStoredInfoTypesResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DlpServiceSettings this]
    (-> this (.listStoredInfoTypesSettings))))

(defn update-inspect-template-settings
  "Returns the object with the settings used for calls to updateInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.UpdateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.updateInspectTemplateSettings))))

(defn delete-dlp-job-settings
  "Returns the object with the settings used for calls to deleteDlpJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeleteDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deleteDlpJobSettings))))

(defn get-inspect-template-settings
  "Returns the object with the settings used for calls to getInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.GetInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.getInspectTemplateSettings))))

(defn delete-job-trigger-settings
  "Returns the object with the settings used for calls to deleteJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeleteJobTriggerRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deleteJobTriggerSettings))))

(defn redact-image-settings
  "Returns the object with the settings used for calls to redactImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.RedactImageRequest,com.google.privacy.dlp.v2.RedactImageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.redactImageSettings))))

(defn create-deidentify-template-settings
  "Returns the object with the settings used for calls to createDeidentifyTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.createDeidentifyTemplateSettings))))

(defn create-job-trigger-settings
  "Returns the object with the settings used for calls to createJobTrigger.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CreateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.createJobTriggerSettings))))

(defn list-info-types-settings
  "Returns the object with the settings used for calls to listInfoTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.ListInfoTypesRequest,com.google.privacy.dlp.v2.ListInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.listInfoTypesSettings))))

(defn create-stored-info-type-settings
  "Returns the object with the settings used for calls to createStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.createStoredInfoTypeSettings))))

(defn list-job-triggers-settings
  "Returns the object with the settings used for calls to listJobTriggers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.privacy.dlp.v2.ListJobTriggersResponse,com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DlpServiceSettings this]
    (-> this (.listJobTriggersSettings))))

(defn delete-stored-info-type-settings
  "Returns the object with the settings used for calls to deleteStoredInfoType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.deleteStoredInfoTypeSettings))))

(defn create-inspect-template-settings
  "Returns the object with the settings used for calls to createInspectTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.privacy.dlp.v2.CreateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DlpServiceSettings this]
    (-> this (.createInspectTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dlp.v2.DlpServiceSettings$Builder`"
  (^com.google.cloud.dlp.v2.DlpServiceSettings$Builder [^DlpServiceSettings this]
    (-> this (.toBuilder))))

