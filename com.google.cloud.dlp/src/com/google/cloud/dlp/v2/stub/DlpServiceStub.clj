(ns com.google.cloud.dlp.v2.stub.DlpServiceStub
  "Base stub class for Cloud Data Loss Prevention (DLP) API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dlp.v2.stub DlpServiceStub]))

(defn ->dlp-service-stub
  "Constructor."
  (^DlpServiceStub []
    (new DlpServiceStub )))

(defn update-deidentify-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.updateDeidentifyTemplateCallable))))

(defn cancel-dlp-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CancelDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.cancelDlpJobCallable))))

(defn update-job-trigger-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.updateJobTriggerCallable))))

(defn delete-inspect-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteInspectTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deleteInspectTemplateCallable))))

(defn create-job-trigger-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.createJobTriggerCallable))))

(defn delete-deidentify-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deleteDeidentifyTemplateCallable))))

(defn create-deidentify-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.createDeidentifyTemplateCallable))))

(defn inspect-content-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.InspectContentRequest,com.google.privacy.dlp.v2.InspectContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.inspectContentCallable))))

(defn list-info-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInfoTypesRequest,com.google.privacy.dlp.v2.ListInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listInfoTypesCallable))))

(defn get-job-trigger-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetJobTriggerRequest,com.google.privacy.dlp.v2.JobTrigger>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.getJobTriggerCallable))))

(defn list-deidentify-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listDeidentifyTemplatesCallable))))

(defn delete-dlp-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteDlpJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deleteDlpJobCallable))))

(defn list-dlp-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.privacy.dlp.v2.ListDlpJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listDlpJobsCallable))))

(defn delete-stored-info-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deleteStoredInfoTypeCallable))))

(defn reidentify-content-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ReidentifyContentRequest,com.google.privacy.dlp.v2.ReidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.reidentifyContentCallable))))

(defn delete-job-trigger-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeleteJobTriggerRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deleteJobTriggerCallable))))

(defn create-dlp-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.createDlpJobCallable))))

(defn get-inspect-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.getInspectTemplateCallable))))

(defn update-inspect-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.updateInspectTemplateCallable))))

(defn deidentify-content-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.DeidentifyContentRequest,com.google.privacy.dlp.v2.DeidentifyContentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.deidentifyContentCallable))))

(defn create-inspect-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateInspectTemplateRequest,com.google.privacy.dlp.v2.InspectTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.createInspectTemplateCallable))))

(defn close
  ""
  ([^DlpServiceStub this]
    (-> this (.close))))

(defn list-dlp-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDlpJobsRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listDlpJobsPagedCallable))))

(defn get-dlp-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetDlpJobRequest,com.google.privacy.dlp.v2.DlpJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.getDlpJobCallable))))

(defn list-job-triggers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.privacy.dlp.v2.ListJobTriggersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listJobTriggersCallable))))

(defn update-stored-info-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.updateStoredInfoTypeCallable))))

(defn create-stored-info-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.createStoredInfoTypeCallable))))

(defn list-stored-info-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listStoredInfoTypesPagedCallable))))

(defn get-stored-info-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetStoredInfoTypeRequest,com.google.privacy.dlp.v2.StoredInfoType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.getStoredInfoTypeCallable))))

(defn list-stored-info-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListStoredInfoTypesRequest,com.google.privacy.dlp.v2.ListStoredInfoTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listStoredInfoTypesCallable))))

(defn list-inspect-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.privacy.dlp.v2.ListInspectTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listInspectTemplatesCallable))))

(defn list-inspect-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListInspectTemplatesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listInspectTemplatesPagedCallable))))

(defn get-deidentify-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest,com.google.privacy.dlp.v2.DeidentifyTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.getDeidentifyTemplateCallable))))

(defn list-deidentify-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listDeidentifyTemplatesPagedCallable))))

(defn redact-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.RedactImageRequest,com.google.privacy.dlp.v2.RedactImageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.redactImageCallable))))

(defn list-job-triggers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.privacy.dlp.v2.ListJobTriggersRequest,com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DlpServiceStub this]
    (-> this (.listJobTriggersPagedCallable))))

