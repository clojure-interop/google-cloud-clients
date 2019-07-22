(ns com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse/createAsync context future-response)))

