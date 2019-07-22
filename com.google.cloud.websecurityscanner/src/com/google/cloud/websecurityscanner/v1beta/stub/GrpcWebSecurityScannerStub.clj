(ns com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerStub
  "gRPC stub implementation for Web Security Scanner API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta.stub GrpcWebSecurityScannerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerStub`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcWebSecurityScannerStub/create client-context callable-factory))
  (^com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerStub [^com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings settings]
    (GrpcWebSecurityScannerStub/create settings)))

(defn get-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.getScanConfigCallable))))

(defn update-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.updateScanConfigCallable))))

(defn list-scan-runs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listScanRunsPagedCallable))))

(defn list-crawled-urls-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listCrawledUrlsPagedCallable))))

(defn list-finding-type-stats-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listFindingTypeStatsCallable))))

(defn list-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listFindingsCallable))))

(defn get-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.getScanRunCallable))))

(defn delete-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.deleteScanConfigCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcWebSecurityScannerStub this]
    (-> this (.isShutdown))))

(defn list-scan-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listScanConfigsCallable))))

(defn get-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,com.google.cloud.websecurityscanner.v1beta.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.getFindingCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcWebSecurityScannerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-crawled-urls-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listCrawledUrlsCallable))))

(defn shutdown
  ""
  ([^GrpcWebSecurityScannerStub this]
    (-> this (.shutdown))))

(defn list-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listFindingsPagedCallable))))

(defn start-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.startScanRunCallable))))

(defn close
  ""
  ([^GrpcWebSecurityScannerStub this]
    (-> this (.close))))

(defn list-scan-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listScanConfigsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcWebSecurityScannerStub this]
    (-> this (.isTerminated))))

(defn stop-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.stopScanRunCallable))))

(defn create-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.createScanConfigCallable))))

(defn shutdown-now
  ""
  ([^GrpcWebSecurityScannerStub this]
    (-> this (.shutdownNow))))

(defn list-scan-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebSecurityScannerStub this]
    (-> this (.listScanRunsCallable))))

