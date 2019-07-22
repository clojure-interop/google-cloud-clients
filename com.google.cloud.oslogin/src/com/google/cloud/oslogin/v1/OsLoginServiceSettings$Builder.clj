(ns com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder
  "Builder for OsLoginServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1 OsLoginServiceSettings$Builder]))

(defn import-ssh-public-key-settings
  "Returns the builder for the settings used for calls to importSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.importSshPublicKeySettings))))

(defn get-ssh-public-key-settings
  "Returns the builder for the settings used for calls to getSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.getSshPublicKeySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings$Builder [^OsLoginServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-ssh-public-key-settings
  "Returns the builder for the settings used for calls to updateSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.updateSshPublicKeySettings))))

(defn delete-posix-account-settings
  "Returns the builder for the settings used for calls to deletePosixAccount.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.deletePosixAccountSettings))))

(defn build
  "returns: `com.google.cloud.oslogin.v1.OsLoginServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.oslogin.v1.OsLoginServiceSettings [^OsLoginServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings$Builder`"
  (^com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings$Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn get-login-profile-settings
  "Returns the builder for the settings used for calls to getLoginProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.getLoginProfileSettings))))

(defn delete-ssh-public-key-settings
  "Returns the builder for the settings used for calls to deleteSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceSettings$Builder this]
    (-> this (.deleteSshPublicKeySettings))))

