(ns com.google.cloud.talent.v4beta1.stub.ProfileServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ProfileServiceStub]))

(defn ->profile-service-stub
  "Constructor."
  (^ProfileServiceStub []
    (new ProfileServiceStub )))

(defn search-profiles-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.searchProfilesPagedCallable))))

(defn list-profiles-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.listProfilesPagedCallable))))

(defn update-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.updateProfileCallable))))

(defn delete-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.deleteProfileCallable))))

(defn get-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.getProfileCallable))))

(defn search-profiles-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.searchProfilesCallable))))

(defn list-profiles-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.listProfilesCallable))))

(defn close
  ""
  ([^ProfileServiceStub this]
    (-> this (.close))))

(defn create-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProfileServiceStub this]
    (-> this (.createProfileCallable))))

