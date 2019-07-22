(ns com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ProfileServiceClient$SearchProfilesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ProfileServiceClient$SearchProfilesPagedResponse/createAsync context future-response)))

