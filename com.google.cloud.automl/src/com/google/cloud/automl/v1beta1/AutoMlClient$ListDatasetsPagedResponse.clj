(ns com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 AutoMlClient$ListDatasetsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (AutoMlClient$ListDatasetsPagedResponse/createAsync context future-response)))

