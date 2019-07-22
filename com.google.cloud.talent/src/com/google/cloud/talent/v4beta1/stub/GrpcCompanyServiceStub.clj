(ns com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcCompanyServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcCompanyServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceStub [^com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings settings]
    (GrpcCompanyServiceStub/create settings)))

(defn create-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.createCompanyCallable))))

(defn delete-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteCompanyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.deleteCompanyCallable))))

(defn update-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.updateCompanyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcCompanyServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcCompanyServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcCompanyServiceStub this]
    (-> this (.shutdown))))

(defn list-companies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.ListCompaniesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.listCompaniesCallable))))

(defn close
  ""
  ([^GrpcCompanyServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcCompanyServiceStub this]
    (-> this (.isTerminated))))

(defn list-companies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListCompaniesRequest,com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.listCompaniesPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcCompanyServiceStub this]
    (-> this (.shutdownNow))))

(defn get-company-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetCompanyRequest,com.google.cloud.talent.v4beta1.Company>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCompanyServiceStub this]
    (-> this (.getCompanyCallable))))

