(ns com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings
  "Settings class to configure an instance of JobServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createJob to 30 seconds:



  JobServiceStubSettings.Builder jobServiceSettingsBuilder =
      JobServiceStubSettings.newBuilder();
  jobServiceSettingsBuilder.createJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  JobServiceStubSettings jobServiceSettings = jobServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub JobServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (JobServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (JobServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (JobServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (JobServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (JobServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (JobServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (JobServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (JobServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder []
    (JobServiceStubSettings/newBuilder )))

(defn create-job-settings
  "Returns the object with the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.getJobSettings))))

(defn batch-update-jobs-operation-settings
  "Returns the object with the settings used for calls to batchUpdateJobs.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStubSettings this]
    (-> this (.batchUpdateJobsOperationSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.JobServiceStub`

  throws: java.io.IOException"
  ([^JobServiceStubSettings this]
    (-> this (.createStub))))

(defn search-jobs-settings
  "Returns the object with the settings used for calls to searchJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceStubSettings this]
    (-> this (.searchJobsSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceStubSettings this]
    (-> this (.listJobsSettings))))

(defn batch-create-jobs-settings
  "Returns the object with the settings used for calls to batchCreateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.batchCreateJobsSettings))))

(defn batch-delete-jobs-settings
  "Returns the object with the settings used for calls to batchDeleteJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.batchDeleteJobsSettings))))

(defn batch-create-jobs-operation-settings
  "Returns the object with the settings used for calls to batchCreateJobs.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStubSettings this]
    (-> this (.batchCreateJobsOperationSettings))))

(defn batch-update-jobs-settings
  "Returns the object with the settings used for calls to batchUpdateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.batchUpdateJobsSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.updateJobSettings))))

(defn search-jobs-for-alert-settings
  "Returns the object with the settings used for calls to searchJobsForAlert.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobServiceStubSettings this]
    (-> this (.searchJobsForAlertSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobServiceStubSettings this]
    (-> this (.deleteJobSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder [^JobServiceStubSettings this]
    (-> this (.toBuilder))))

