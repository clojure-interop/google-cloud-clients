(ns com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings$Builder
  "Builder for OsLoginServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1.stub OsLoginServiceStubSettings$Builder]))

(defn import-ssh-public-key-settings
  "Returns the builder for the settings used for calls to importSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.importSshPublicKeySettings))))

(defn get-ssh-public-key-settings
  "Returns the builder for the settings used for calls to getSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.getSshPublicKeySettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings$Builder [^OsLoginServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-ssh-public-key-settings
  "Returns the builder for the settings used for calls to updateSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.updateSshPublicKeySettings))))

(defn delete-posix-account-settings
  "Returns the builder for the settings used for calls to deletePosixAccount.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.deletePosixAccountSettings))))

(defn build
  "returns: `com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings [^OsLoginServiceStubSettings$Builder this]
    (-> this (.build))))

(defn get-login-profile-settings
  "Returns the builder for the settings used for calls to getLoginProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.getLoginProfileSettings))))

(defn delete-ssh-public-key-settings
  "Returns the builder for the settings used for calls to deleteSshPublicKey.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^OsLoginServiceStubSettings$Builder this]
    (-> this (.deleteSshPublicKeySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^OsLoginServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

