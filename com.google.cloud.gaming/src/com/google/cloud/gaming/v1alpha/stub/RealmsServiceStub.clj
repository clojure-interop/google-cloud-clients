(ns com.google.cloud.gaming.v1alpha.stub.RealmsServiceStub
  "Base stub class for gameservices API (prod).

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub RealmsServiceStub]))

(defn ->realms-service-stub
  "Constructor."
  (^RealmsServiceStub []
    (new RealmsServiceStub )))

(defn delete-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^RealmsServiceStub this]
    (-> this (.deleteRealmOperationCallable))))

(defn update-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStub this]
    (-> this (.updateRealmOperationCallable))))

(defn delete-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.deleteRealmCallable))))

(defn create-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.createRealmCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^RealmsServiceStub this]
    (-> this (.getOperationsStub))))

(defn list-realms-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.listRealmsCallable))))

(defn list-realms-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.listRealmsPagedCallable))))

(defn update-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.updateRealmCallable))))

(defn create-realm-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStub this]
    (-> this (.createRealmOperationCallable))))

(defn close
  ""
  ([^RealmsServiceStub this]
    (-> this (.close))))

(defn get-realm-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceStub this]
    (-> this (.getRealmCallable))))

