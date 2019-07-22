(ns com.google.cloud.oslogin.v1.stub.OsLoginServiceStub
  "Base stub class for Google Cloud OS Login API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1.stub OsLoginServiceStub]))

(defn ->os-login-service-stub
  "Constructor."
  (^OsLoginServiceStub []
    (new OsLoginServiceStub )))

(defn delete-posix-account-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.deletePosixAccountCallable))))

(defn delete-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.deleteSshPublicKeyCallable))))

(defn get-login-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.getLoginProfileCallable))))

(defn get-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.getSshPublicKeyCallable))))

(defn import-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.importSshPublicKeyCallable))))

(defn update-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^OsLoginServiceStub this]
    (-> this (.updateSshPublicKeyCallable))))

(defn close
  ""
  ([^OsLoginServiceStub this]
    (-> this (.close))))

