(ns com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceTemplateClient$ListInstanceTemplatesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPage>`"
  (^com.google.api.core.ApiFuture [^InstanceTemplateClient$ListInstanceTemplatesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

