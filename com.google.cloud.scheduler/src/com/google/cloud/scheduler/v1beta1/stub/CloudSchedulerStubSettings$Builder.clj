(ns com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder
  "Builder for CloudSchedulerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1beta1.stub CloudSchedulerStubSettings$Builder]))

(defn create-job-settings
  "Returns the builder for the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.CreateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the builder for the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.GetJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.getJobSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder [^CloudSchedulerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn resume-job-settings
  "Returns the builder for the settings used for calls to resumeJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.ResumeJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.resumeJobSettings))))

(defn run-job-settings
  "Returns the builder for the settings used for calls to runJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.RunJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.runJobSettings))))

(defn list-jobs-settings
  "Returns the builder for the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.ListJobsResponse,com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.listJobsSettings))))

(defn build
  "returns: `com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings [^CloudSchedulerStubSettings$Builder this]
    (-> this (.build))))

(defn pause-job-settings
  "Returns the builder for the settings used for calls to pauseJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.PauseJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.pauseJobSettings))))

(defn update-job-settings
  "Returns the builder for the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.UpdateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.updateJobSettings))))

(defn delete-job-settings
  "Returns the builder for the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerStubSettings$Builder this]
    (-> this (.deleteJobSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^CloudSchedulerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

