(ns com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcProfileServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcProfileServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceStub [^com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings settings]
    (GrpcProfileServiceStub/create settings)))

(defn search-profiles-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.searchProfilesPagedCallable))))

(defn list-profiles-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.listProfilesPagedCallable))))

(defn update-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.updateProfileCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcProfileServiceStub this]
    (-> this (.isShutdown))))

(defn delete-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.deleteProfileCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcProfileServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcProfileServiceStub this]
    (-> this (.shutdown))))

(defn get-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.getProfileCallable))))

(defn search-profiles-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchProfilesRequest,com.google.cloud.talent.v4beta1.SearchProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.searchProfilesCallable))))

(defn list-profiles-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListProfilesRequest,com.google.cloud.talent.v4beta1.ListProfilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.listProfilesCallable))))

(defn close
  ""
  ([^GrpcProfileServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcProfileServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcProfileServiceStub this]
    (-> this (.shutdownNow))))

(defn create-profile-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateProfileRequest,com.google.cloud.talent.v4beta1.Profile>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProfileServiceStub this]
    (-> this (.createProfileCallable))))

