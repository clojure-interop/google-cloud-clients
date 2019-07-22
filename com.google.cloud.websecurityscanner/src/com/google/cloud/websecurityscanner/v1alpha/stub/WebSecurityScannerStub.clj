(ns com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStub
  "Base stub class for Web Security Scanner API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha.stub WebSecurityScannerStub]))

(defn ->web-security-scanner-stub
  "Constructor."
  (^WebSecurityScannerStub []
    (new WebSecurityScannerStub )))

(defn get-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getScanConfigCallable))))

(defn update-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.updateScanConfigCallable))))

(defn list-scan-runs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanRunsPagedCallable))))

(defn list-crawled-urls-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listCrawledUrlsPagedCallable))))

(defn list-finding-type-stats-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingTypeStatsCallable))))

(defn list-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingsCallable))))

(defn get-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getScanRunCallable))))

(defn delete-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.deleteScanConfigCallable))))

(defn list-scan-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanConfigsCallable))))

(defn get-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetFindingRequest,com.google.cloud.websecurityscanner.v1alpha.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getFindingCallable))))

(defn list-crawled-urls-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listCrawledUrlsCallable))))

(defn list-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingsPagedCallable))))

(defn start-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.StartScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.startScanRunCallable))))

(defn close
  ""
  ([^WebSecurityScannerStub this]
    (-> this (.close))))

(defn list-scan-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanConfigsPagedCallable))))

(defn stop-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.StopScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.stopScanRunCallable))))

(defn create-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.createScanConfigCallable))))

(defn list-scan-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanRunsCallable))))

