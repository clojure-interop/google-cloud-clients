(ns com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings
  "Settings class to configure an instance of CloudSchedulerStub.

  The default instance has everything set to sensible defaults:


    The default service address (cloudscheduler.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getJob to 30 seconds:



  CloudSchedulerStubSettings.Builder cloudSchedulerSettingsBuilder =
      CloudSchedulerStubSettings.newBuilder();
  cloudSchedulerSettingsBuilder.getJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CloudSchedulerStubSettings cloudSchedulerSettings = cloudSchedulerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1beta1.stub CloudSchedulerStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CloudSchedulerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CloudSchedulerStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CloudSchedulerStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CloudSchedulerStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CloudSchedulerStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CloudSchedulerStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CloudSchedulerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder`"
  (^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CloudSchedulerStubSettings/newBuilder client-context))
  (^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder []
    (CloudSchedulerStubSettings/newBuilder )))

(defn create-job-settings
  "Returns the object with the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.CreateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.GetJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.getJobSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStub`

  throws: java.io.IOException"
  ([^CloudSchedulerStubSettings this]
    (-> this (.createStub))))

(defn resume-job-settings
  "Returns the object with the settings used for calls to resumeJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.ResumeJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.resumeJobSettings))))

(defn run-job-settings
  "Returns the object with the settings used for calls to runJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.RunJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.runJobSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.ListJobsResponse,com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.listJobsSettings))))

(defn pause-job-settings
  "Returns the object with the settings used for calls to pauseJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.PauseJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.pauseJobSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.UpdateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.updateJobSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerStubSettings this]
    (-> this (.deleteJobSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder`"
  (^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder [^CloudSchedulerStubSettings this]
    (-> this (.toBuilder))))

