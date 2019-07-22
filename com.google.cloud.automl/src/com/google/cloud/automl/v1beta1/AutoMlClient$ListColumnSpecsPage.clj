(ns com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 AutoMlClient$ListColumnSpecsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPage>`"
  (^com.google.api.core.ApiFuture [^AutoMlClient$ListColumnSpecsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

