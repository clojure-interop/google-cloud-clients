(ns com.google.cloud.talent.v4beta1.ProfileServiceSettings$Builder
  "Builder for ProfileServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ProfileServiceSettings$Builder]))

(defn list-profiles-settings
  "Returns the builder for the settings used for calls to listProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.listProfilesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.ProfileServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.ProfileServiceSettings$Builder [^ProfileServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-profile-settings
  "Returns the builder for the settings used for calls to createProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.createProfileSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.ProfileServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.ProfileServiceSettings [^ProfileServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder [^ProfileServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-profile-settings
  "Returns the builder for the settings used for calls to getProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.getProfileSettings))))

(defn update-profile-settings
  "Returns the builder for the settings used for calls to updateProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.updateProfileSettings))))

(defn search-profiles-settings
  "Returns the builder for the settings used for calls to searchProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.searchProfilesSettings))))

(defn delete-profile-settings
  "Returns the builder for the settings used for calls to deleteProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceSettings$Builder this]
    (-> this (.deleteProfileSettings))))

