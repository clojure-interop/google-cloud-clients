(ns com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1 TranslationServiceClient$ListGlossariesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (TranslationServiceClient$ListGlossariesPagedResponse/createAsync context future-response)))

