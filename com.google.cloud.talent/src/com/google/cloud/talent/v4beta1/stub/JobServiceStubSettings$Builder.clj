(ns com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder
  "Builder for JobServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub JobServiceStubSettings$Builder]))

(defn create-job-settings
  "Returns the builder for the settings used for calls to createJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.createJobSettings))))

(defn get-job-settings
  "Returns the builder for the settings used for calls to getJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.getJobSettings))))

(defn batch-update-jobs-operation-settings
  "Returns the builder for the settings used for calls to batchUpdateJobs.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStubSettings$Builder this]
    (-> this (.batchUpdateJobsOperationSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder [^JobServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn search-jobs-settings
  "Returns the builder for the settings used for calls to searchJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.searchJobsSettings))))

(defn list-jobs-settings
  "Returns the builder for the settings used for calls to listJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.listJobsSettings))))

(defn batch-create-jobs-settings
  "Returns the builder for the settings used for calls to batchCreateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.batchCreateJobsSettings))))

(defn batch-delete-jobs-settings
  "Returns the builder for the settings used for calls to batchDeleteJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.batchDeleteJobsSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings [^JobServiceStubSettings$Builder this]
    (-> this (.build))))

(defn batch-create-jobs-operation-settings
  "Returns the builder for the settings used for calls to batchCreateJobs.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStubSettings$Builder this]
    (-> this (.batchCreateJobsOperationSettings))))

(defn batch-update-jobs-settings
  "Returns the builder for the settings used for calls to batchUpdateJobs.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.batchUpdateJobsSettings))))

(defn update-job-settings
  "Returns the builder for the settings used for calls to updateJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.updateJobSettings))))

(defn search-jobs-for-alert-settings
  "Returns the builder for the settings used for calls to searchJobsForAlert.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.searchJobsForAlertSettings))))

(defn delete-job-settings
  "Returns the builder for the settings used for calls to deleteJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^JobServiceStubSettings$Builder this]
    (-> this (.deleteJobSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^JobServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

