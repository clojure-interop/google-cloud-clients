(ns com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder
  "Builder for IamCredentialsSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iam.credentials.v1 IamCredentialsSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.iam.credentials.v1.stub.IamCredentialsStubSettings$Builder`"
  (^com.google.cloud.iam.credentials.v1.stub.IamCredentialsStubSettings$Builder [^IamCredentialsSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings$Builder [^IamCredentialsSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn generate-access-token-settings
  "Returns the builder for the settings used for calls to generateAccessToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest,com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IamCredentialsSettings$Builder this]
    (-> this (.generateAccessTokenSettings))))

(defn generate-id-token-settings
  "Returns the builder for the settings used for calls to generateIdToken.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest,com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IamCredentialsSettings$Builder this]
    (-> this (.generateIdTokenSettings))))

(defn sign-blob-settings
  "Returns the builder for the settings used for calls to signBlob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iam.credentials.v1.SignBlobRequest,com.google.cloud.iam.credentials.v1.SignBlobResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IamCredentialsSettings$Builder this]
    (-> this (.signBlobSettings))))

(defn sign-jwt-settings
  "Returns the builder for the settings used for calls to signJwt.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iam.credentials.v1.SignJwtRequest,com.google.cloud.iam.credentials.v1.SignJwtResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IamCredentialsSettings$Builder this]
    (-> this (.signJwtSettings))))

(defn build
  "returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings [^IamCredentialsSettings$Builder this]
    (-> this (.build))))

