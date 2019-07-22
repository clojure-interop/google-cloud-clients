(ns com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder
  "Builder for JobControllerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub JobControllerStubSettings$Builder]))

(defn get-job-settings
  "Returns the builder for the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.GetJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.getJobSettings))))

(defn cancel-job-settings
  "Returns the builder for the settings used for calls to cancelJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.CancelJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.cancelJobSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder [^JobControllerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-jobs-settings
  "Returns the builder for the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1beta2.ListJobsRequest,com.google.cloud.dataproc.v1beta2.ListJobsResponse,com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.listJobsSettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings [^JobControllerStubSettings$Builder this]
    (-> this (.build))))

(defn submit-job-settings
  "Returns the builder for the settings used for calls to submitJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.SubmitJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.submitJobSettings))))

(defn update-job-settings
  "Returns the builder for the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.UpdateJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.updateJobSettings))))

(defn delete-job-settings
  "Returns the builder for the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobControllerStubSettings$Builder this]
    (-> this (.deleteJobSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^JobControllerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

