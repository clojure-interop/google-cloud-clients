(ns com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceStub
  "gRPC stub implementation for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub GrpcRealmsServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcRealmsServiceStub/create client-context callable-factory))
  (^com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceStub [^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings settings]
    (GrpcRealmsServiceStub/create settings)))

(defn delete-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GrpcRealmsServiceStub this]
    (-> this (.deleteRealmOperationCallable))))

(defn update-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^GrpcRealmsServiceStub this]
    (-> this (.updateRealmOperationCallable))))

(defn delete-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.deleteRealmCallable))))

(defn create-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.createRealmCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcRealmsServiceStub this]
    (-> this (.getOperationsStub))))

(defn list-realms-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.listRealmsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcRealmsServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcRealmsServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-realms-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.listRealmsPagedCallable))))

(defn shutdown
  ""
  ([^GrpcRealmsServiceStub this]
    (-> this (.shutdown))))

(defn update-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.updateRealmCallable))))

(defn create-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^GrpcRealmsServiceStub this]
    (-> this (.createRealmOperationCallable))))

(defn close
  ""
  ([^GrpcRealmsServiceStub this]
    (-> this (.close))))

(defn get-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRealmsServiceStub this]
    (-> this (.getRealmCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcRealmsServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcRealmsServiceStub this]
    (-> this (.shutdownNow))))

