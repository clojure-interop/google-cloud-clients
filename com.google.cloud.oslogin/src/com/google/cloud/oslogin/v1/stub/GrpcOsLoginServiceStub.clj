(ns com.google.cloud.oslogin.v1.stub.GrpcOsLoginServiceStub
  "gRPC stub implementation for Google Cloud OS Login API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.oslogin.v1.stub GrpcOsLoginServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.oslogin.v1.stub.GrpcOsLoginServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.oslogin.v1.stub.GrpcOsLoginServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcOsLoginServiceStub/create client-context callable-factory))
  (^com.google.cloud.oslogin.v1.stub.GrpcOsLoginServiceStub [^com.google.cloud.oslogin.v1.stub.OsLoginServiceStubSettings settings]
    (GrpcOsLoginServiceStub/create settings)))

(defn get-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.getSshPublicKeyCallable))))

(defn delete-posix-account-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.deletePosixAccountCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcOsLoginServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcOsLoginServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcOsLoginServiceStub this]
    (-> this (.shutdown))))

(defn get-login-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.GetLoginProfileRequest,com.google.cloud.oslogin.v1.LoginProfile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.getLoginProfileCallable))))

(defn close
  ""
  ([^GrpcOsLoginServiceStub this]
    (-> this (.close))))

(defn import-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.importSshPublicKeyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcOsLoginServiceStub this]
    (-> this (.isTerminated))))

(defn delete-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.deleteSshPublicKeyCallable))))

(defn update-ssh-public-key-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,com.google.cloud.oslogin.common.OsLoginProto$SshPublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcOsLoginServiceStub this]
    (-> this (.updateSshPublicKeyCallable))))

(defn shutdown-now
  ""
  ([^GrpcOsLoginServiceStub this]
    (-> this (.shutdownNow))))

