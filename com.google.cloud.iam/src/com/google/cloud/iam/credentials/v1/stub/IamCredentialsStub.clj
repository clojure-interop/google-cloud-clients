(ns com.google.cloud.iam.credentials.v1.stub.IamCredentialsStub
  "Base stub class for IAM Service Account Credentials API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iam.credentials.v1.stub IamCredentialsStub]))

(defn ->iam-credentials-stub
  "Constructor."
  (^IamCredentialsStub []
    (new IamCredentialsStub )))

(defn generate-access-token-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest,com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsStub this]
    (-> this (.generateAccessTokenCallable))))

(defn generate-id-token-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest,com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsStub this]
    (-> this (.generateIdTokenCallable))))

(defn sign-blob-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignBlobRequest,com.google.cloud.iam.credentials.v1.SignBlobResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsStub this]
    (-> this (.signBlobCallable))))

(defn sign-jwt-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignJwtRequest,com.google.cloud.iam.credentials.v1.SignJwtResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsStub this]
    (-> this (.signJwtCallable))))

(defn close
  ""
  ([^IamCredentialsStub this]
    (-> this (.close))))

