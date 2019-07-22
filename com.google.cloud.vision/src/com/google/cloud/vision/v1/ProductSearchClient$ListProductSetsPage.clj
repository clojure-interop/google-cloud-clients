(ns com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1 ProductSearchClient$ListProductSetsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPage>`"
  (^com.google.api.core.ApiFuture [^ProductSearchClient$ListProductSetsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

