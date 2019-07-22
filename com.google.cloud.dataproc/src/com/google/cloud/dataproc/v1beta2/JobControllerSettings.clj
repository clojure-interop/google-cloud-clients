(ns com.google.cloud.dataproc.v1beta2.JobControllerSettings
  "Settings class to configure an instance of JobControllerClient.

  The default instance has everything set to sensible defaults:


    The default service address (dataproc.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of submitJob to 30 seconds:



  JobControllerSettings.Builder jobControllerSettingsBuilder =
      JobControllerSettings.newBuilder();
  jobControllerSettingsBuilder.submitJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  JobControllerSettings jobControllerSettings = jobControllerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 JobControllerSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (JobControllerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (JobControllerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (JobControllerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (JobControllerSettings/newBuilder client-context))
  (^com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder []
    (JobControllerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (JobControllerSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings`

  returns: `com.google.cloud.dataproc.v1beta2.JobControllerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.JobControllerSettings [^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings stub]
    (JobControllerSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (JobControllerSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (JobControllerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (JobControllerSettings/getDefaultServiceScopes )))

(defn submit-job-settings
  "Returns the object with the settings used for calls to submitJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.SubmitJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerSettings this]
    (-> this (.submitJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.GetJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerSettings this]
    (-> this (.getJobSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dataproc.v1beta2.ListJobsRequest,com.google.cloud.dataproc.v1beta2.ListJobsResponse,com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobControllerSettings this]
    (-> this (.listJobsSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.UpdateJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerSettings this]
    (-> this (.updateJobSettings))))

(defn cancel-job-settings
  "Returns the object with the settings used for calls to cancelJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.CancelJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerSettings this]
    (-> this (.cancelJobSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerSettings this]
    (-> this (.deleteJobSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder [^JobControllerSettings this]
    (-> this (.toBuilder))))

