(ns com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ProfileServiceClient$ListProfilesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPage>`"
  (^com.google.api.core.ApiFuture [^ProfileServiceClient$ListProfilesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

