(ns com.google.cloud.scheduler.v1.CloudSchedulerSettings
  "Settings class to configure an instance of CloudSchedulerClient.

  The default instance has everything set to sensible defaults:


    The default service address (cloudscheduler.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getJob to 30 seconds:



  CloudSchedulerSettings.Builder cloudSchedulerSettingsBuilder =
      CloudSchedulerSettings.newBuilder();
  cloudSchedulerSettingsBuilder.getJobSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CloudSchedulerSettings cloudSchedulerSettings = cloudSchedulerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1 CloudSchedulerSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CloudSchedulerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CloudSchedulerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CloudSchedulerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder`"
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CloudSchedulerSettings/newBuilder client-context))
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder []
    (CloudSchedulerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CloudSchedulerSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings`

  returns: `com.google.cloud.scheduler.v1.CloudSchedulerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings [^com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings stub]
    (CloudSchedulerSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CloudSchedulerSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CloudSchedulerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CloudSchedulerSettings/getDefaultServiceScopes )))

(defn create-job-settings
  "Returns the object with the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.CreateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the object with the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.GetJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.getJobSettings))))

(defn resume-job-settings
  "Returns the object with the settings used for calls to resumeJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.ResumeJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.resumeJobSettings))))

(defn run-job-settings
  "Returns the object with the settings used for calls to runJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.RunJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.runJobSettings))))

(defn list-jobs-settings
  "Returns the object with the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.scheduler.v1.ListJobsRequest,com.google.cloud.scheduler.v1.ListJobsResponse,com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudSchedulerSettings this]
    (-> this (.listJobsSettings))))

(defn pause-job-settings
  "Returns the object with the settings used for calls to pauseJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.PauseJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.pauseJobSettings))))

(defn update-job-settings
  "Returns the object with the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.UpdateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.updateJobSettings))))

(defn delete-job-settings
  "Returns the object with the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.scheduler.v1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudSchedulerSettings this]
    (-> this (.deleteJobSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder`"
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder [^CloudSchedulerSettings this]
    (-> this (.toBuilder))))

