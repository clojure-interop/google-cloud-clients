(ns com.google.cloud.iam.credentials.v1.stub.GrpcIamCredentialsStub
  "gRPC stub implementation for IAM Service Account Credentials API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iam.credentials.v1.stub GrpcIamCredentialsStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.iam.credentials.v1.stub.GrpcIamCredentialsStub`

  throws: java.io.IOException"
  (^com.google.cloud.iam.credentials.v1.stub.GrpcIamCredentialsStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcIamCredentialsStub/create client-context callable-factory))
  (^com.google.cloud.iam.credentials.v1.stub.GrpcIamCredentialsStub [^com.google.cloud.iam.credentials.v1.stub.IamCredentialsStubSettings settings]
    (GrpcIamCredentialsStub/create settings)))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcIamCredentialsStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcIamCredentialsStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcIamCredentialsStub this]
    (-> this (.shutdown))))

(defn sign-blob-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignBlobRequest,com.google.cloud.iam.credentials.v1.SignBlobResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIamCredentialsStub this]
    (-> this (.signBlobCallable))))

(defn close
  ""
  ([^GrpcIamCredentialsStub this]
    (-> this (.close))))

(defn generate-id-token-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest,com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIamCredentialsStub this]
    (-> this (.generateIdTokenCallable))))

(defn sign-jwt-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignJwtRequest,com.google.cloud.iam.credentials.v1.SignJwtResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIamCredentialsStub this]
    (-> this (.signJwtCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcIamCredentialsStub this]
    (-> this (.isTerminated))))

(defn generate-access-token-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest,com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcIamCredentialsStub this]
    (-> this (.generateAccessTokenCallable))))

(defn shutdown-now
  ""
  ([^GrpcIamCredentialsStub this]
    (-> this (.shutdownNow))))

