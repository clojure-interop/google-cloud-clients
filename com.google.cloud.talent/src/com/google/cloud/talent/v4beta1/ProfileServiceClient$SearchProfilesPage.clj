(ns com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ProfileServiceClient$SearchProfilesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPage>`"
  (^com.google.api.core.ApiFuture [^ProfileServiceClient$SearchProfilesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

