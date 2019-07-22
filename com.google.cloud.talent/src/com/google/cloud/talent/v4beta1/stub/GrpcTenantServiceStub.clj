(ns com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcTenantServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcTenantServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceStub [^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings settings]
    (GrpcTenantServiceStub/create settings)))

(defn get-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.getTenantCallable))))

(defn list-tenants-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.listTenantsCallable))))

(defn list-tenants-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.listTenantsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcTenantServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcTenantServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.createTenantCallable))))

(defn delete-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.deleteTenantCallable))))

(defn shutdown
  ""
  ([^GrpcTenantServiceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcTenantServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcTenantServiceStub this]
    (-> this (.isTerminated))))

(defn update-tenant-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcTenantServiceStub this]
    (-> this (.updateTenantCallable))))

(defn shutdown-now
  ""
  ([^GrpcTenantServiceStub this]
    (-> this (.shutdownNow))))

