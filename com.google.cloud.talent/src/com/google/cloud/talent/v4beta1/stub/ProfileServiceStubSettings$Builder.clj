(ns com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder
  "Builder for ProfileServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub ProfileServiceStubSettings$Builder]))

(defn list-profiles-settings
  "Returns the builder for the settings used for calls to listProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.listProfilesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder [^ProfileServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-profile-settings
  "Returns the builder for the settings used for calls to createProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.createProfileSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings [^ProfileServiceStubSettings$Builder this]
    (-> this (.build))))

(defn get-profile-settings
  "Returns the builder for the settings used for calls to getProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.getProfileSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ProfileServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn update-profile-settings
  "Returns the builder for the settings used for calls to updateProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.updateProfileSettings))))

(defn search-profiles-settings
  "Returns the builder for the settings used for calls to searchProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.searchProfilesSettings))))

(defn delete-profile-settings
  "Returns the builder for the settings used for calls to deleteProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProfileServiceStubSettings$Builder this]
    (-> this (.deleteProfileSettings))))

