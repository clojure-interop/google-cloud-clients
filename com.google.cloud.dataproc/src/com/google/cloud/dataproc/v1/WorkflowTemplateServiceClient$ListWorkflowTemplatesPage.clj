(ns com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 WorkflowTemplateServiceClient$ListWorkflowTemplatesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPage>`"
  (^com.google.api.core.ApiFuture [^WorkflowTemplateServiceClient$ListWorkflowTemplatesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

