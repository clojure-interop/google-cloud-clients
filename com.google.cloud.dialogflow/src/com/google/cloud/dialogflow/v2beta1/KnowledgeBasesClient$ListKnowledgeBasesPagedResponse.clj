(ns com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 KnowledgeBasesClient$ListKnowledgeBasesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (KnowledgeBasesClient$ListKnowledgeBasesPagedResponse/createAsync context future-response)))

