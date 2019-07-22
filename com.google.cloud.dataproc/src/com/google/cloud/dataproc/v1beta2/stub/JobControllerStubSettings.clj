(ns com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings
  "Settings class to configure an instance of JobControllerStub.

  The default instance has everything set to sensible defaults:


    The default service address (dataproc.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of submitJob to 30 seconds:



  JobControllerStubSettings.Builder jobControllerSettingsBuilder =
      JobControllerStubSettings.newBuilder();
  jobControllerSettingsBuilder.submitJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  JobControllerStubSettings jobControllerSettings = jobControllerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub JobControllerStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (JobControllerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (JobControllerStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (JobControllerStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (JobControllerStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (JobControllerStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (JobControllerStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (JobControllerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (JobControllerStubSettings/newBuilder client-context))
  (^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder []
    (JobControllerStubSettings/newBuilder )))

(defn submit-job-settings
  "Returns the object with the settings used for calls to submitJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.SubmitJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerStubSettings this]
    (-> this (.submitJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.GetJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerStubSettings this]
    (-> this (.getJobSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dataproc.v1beta2.ListJobsRequest,com.google.cloud.dataproc.v1beta2.ListJobsResponse,com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^JobControllerStubSettings this]
    (-> this (.listJobsSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.UpdateJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerStubSettings this]
    (-> this (.updateJobSettings))))

(defn cancel-job-settings
  "Returns the object with the settings used for calls to cancelJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.CancelJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerStubSettings this]
    (-> this (.cancelJobSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^JobControllerStubSettings this]
    (-> this (.deleteJobSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dataproc.v1beta2.stub.JobControllerStub`

  throws: java.io.IOException"
  ([^JobControllerStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder [^JobControllerStubSettings this]
    (-> this (.toBuilder))))

