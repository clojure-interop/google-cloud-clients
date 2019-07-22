(ns com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder
  "Builder for CloudSchedulerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1 CloudSchedulerSettings$Builder]))

(defn create-job-settings
  "Returns the builder for the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.CreateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the builder for the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.GetJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.getJobSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder [^CloudSchedulerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn resume-job-settings
  "Returns the builder for the settings used for calls to resumeJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.ResumeJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.resumeJobSettings))))

(defn run-job-settings
  "Returns the builder for the settings used for calls to runJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.RunJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.runJobSettings))))

(defn list-jobs-settings
  "Returns the builder for the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.scheduler.v1.ListJobsRequest,com.google.cloud.scheduler.v1.ListJobsResponse,com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.listJobsSettings))))

(defn build
  "returns: `com.google.cloud.scheduler.v1.CloudSchedulerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.scheduler.v1.CloudSchedulerSettings [^CloudSchedulerSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings$Builder`"
  (^com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings$Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn pause-job-settings
  "Returns the builder for the settings used for calls to pauseJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.PauseJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.pauseJobSettings))))

(defn update-job-settings
  "Returns the builder for the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.UpdateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.updateJobSettings))))

(defn delete-job-settings
  "Returns the builder for the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.scheduler.v1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudSchedulerSettings$Builder this]
    (-> this (.deleteJobSettings))))

