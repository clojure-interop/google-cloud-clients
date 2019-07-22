(ns com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 KnowledgeBasesClient$ListKnowledgeBasesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPage>`"
  (^com.google.api.core.ApiFuture [^KnowledgeBasesClient$ListKnowledgeBasesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

