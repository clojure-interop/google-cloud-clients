(ns com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceClient$ListCryptoKeysPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (KeyManagementServiceClient$ListCryptoKeysPagedResponse/createAsync context future-response)))

