(ns com.google.cloud.talent.v4beta1.JobServiceSettings
  "Settings class to configure an instance of JobServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createJob to 30 seconds:



  JobServiceSettings.Builder jobServiceSettingsBuilder =
      JobServiceSettings.newBuilder();
  jobServiceSettingsBuilder.createJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  JobServiceSettings jobServiceSettings = jobServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 JobServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (JobServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (JobServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (JobServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.JobServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.JobServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (JobServiceSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.JobServiceSettings$Builder []
    (JobServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (JobServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings`

  returns: `com.google.cloud.talent.v4beta1.JobServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.JobServiceSettings [^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings stub]
    (JobServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (JobServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (JobServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (JobServiceSettings/getDefaultServiceScopes )))

(defn create-job-settings
  "Returns the object with the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.getJobSettings))))

(defn batch-update-jobs-operation-settings
  "Returns the object with the settings used for calls to batchUpdateJobs.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceSettings this]
    (-> this (.batchUpdateJobsOperationSettings))))

(defn search-jobs-settings
  "Returns the object with the settings used for calls to searchJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceSettings this]
    (-> this (.searchJobsSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceSettings this]
    (-> this (.listJobsSettings))))

(defn batch-create-jobs-settings
  "Returns the object with the settings used for calls to batchCreateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.batchCreateJobsSettings))))

(defn batch-delete-jobs-settings
  "Returns the object with the settings used for calls to batchDeleteJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.batchDeleteJobsSettings))))

(defn batch-create-jobs-operation-settings
  "Returns the object with the settings used for calls to batchCreateJobs.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceSettings this]
    (-> this (.batchCreateJobsOperationSettings))))

(defn batch-update-jobs-settings
  "Returns the object with the settings used for calls to batchUpdateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.batchUpdateJobsSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.updateJobSettings))))

(defn search-jobs-for-alert-settings
  "Returns the object with the settings used for calls to searchJobsForAlert.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceSettings this]
    (-> this (.searchJobsForAlertSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceSettings this]
    (-> this (.deleteJobSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.JobServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.JobServiceSettings$Builder [^JobServiceSettings this]
    (-> this (.toBuilder))))

