(ns com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 AutoMlClient$ListDatasetsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPage>`"
  (^com.google.api.core.ApiFuture [^AutoMlClient$ListDatasetsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

