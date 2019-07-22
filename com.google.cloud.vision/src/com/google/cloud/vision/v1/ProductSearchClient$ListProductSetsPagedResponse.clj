(ns com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1 ProductSearchClient$ListProductSetsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ProductSearchClient$ListProductSetsPagedResponse/createAsync context future-response)))

