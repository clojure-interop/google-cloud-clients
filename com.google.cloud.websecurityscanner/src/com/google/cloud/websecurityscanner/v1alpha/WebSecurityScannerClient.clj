(ns com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient
  "Service Description: Cloud Web Security Scanner Service identifies security vulnerabilities in
  web applications hosted on Google Cloud Platform. It crawls your application, and attempts to
  exercise as many user inputs and event handlers as possible.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    ScanConfig scanConfig = ScanConfig.newBuilder().build();
    ScanConfig response = webSecurityScannerClient.createScanConfig(parent, scanConfig);
  }

  Note: close() needs to be called on the webSecurityScannerClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of WebSecurityScannerSettings to
  create(). For example:

  To customize credentials:



  WebSecurityScannerSettings webSecurityScannerSettings =
      WebSecurityScannerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  WebSecurityScannerClient webSecurityScannerClient =
      WebSecurityScannerClient.create(webSecurityScannerSettings);

  To customize the endpoint:



  WebSecurityScannerSettings webSecurityScannerSettings =
      WebSecurityScannerSettings.newBuilder().setEndpoint(myEndpoint).build();
  WebSecurityScannerClient webSecurityScannerClient =
      WebSecurityScannerClient.create(webSecurityScannerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1alpha WebSecurityScannerClient]))

(defn *create
  "Constructs an instance of WebSecurityScannerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient [^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings settings]
    (WebSecurityScannerClient/create settings))
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient []
    (WebSecurityScannerClient/create )))

(defn delete-scan-config
  "Deletes an existing ScanConfig and its child resources.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     webSecurityScannerClient.deleteScanConfig(name);
   }

  name - Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfigName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanConfigName name]
    (-> this (.deleteScanConfig name))))

(defn get-scan-config-callable
  "Gets a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     GetScanConfigRequest request = GetScanConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.getScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getScanConfigCallable))))

(defn list-findings
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     for (Finding element : webSecurityScannerClient.listFindings(parent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanRunName`
  filter - The filter expression. The expression must be in the format: <field> <operator> <value>. Supported field: 'finding_type'. Supported operator: '='. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanRunName parent ^java.lang.String filter]
    (-> this (.listFindings parent filter)))
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn update-scan-config-callable
  "Updates a ScanConfig. This method support partial update of a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateScanConfigRequest request = UpdateScanConfigRequest.newBuilder()
       .setScanConfig(scanConfig)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.updateScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.updateScanConfigCallable))))

(defn list-scan-runs-paged-callable
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName parent = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ListScanRunsRequest request = ListScanRunsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListScanRunsPagedResponse> future = webSecurityScannerClient.listScanRunsPagedCallable().futureCall(request);
     // Do something
     for (ScanRun element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanRunsPagedCallable))))

(defn create-scan-config
  "Creates a new ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     ScanConfig response = webSecurityScannerClient.createScanConfig(parent, scanConfig);
   }

  parent - Required. The parent resource name where the scan is created, which should be a project resource name in the format 'projects/{projectId}'. - `com.google.cloud.websecurityscanner.v1alpha.ProjectName`
  scan-config - Required. The ScanConfig to be created. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfig`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ProjectName parent ^com.google.cloud.websecurityscanner.v1alpha.ScanConfig scan-config]
    (-> this (.createScanConfig parent scan-config)))
  (^com.google.cloud.websecurityscanner.v1alpha.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest request]
    (-> this (.createScanConfig request))))

(defn list-crawled-urls-paged-callable
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListCrawledUrlsRequest request = ListCrawledUrlsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListCrawledUrlsPagedResponse> future = webSecurityScannerClient.listCrawledUrlsPagedCallable().futureCall(request);
     // Do something
     for (CrawledUrl element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listCrawledUrlsPagedCallable))))

(defn list-finding-type-stats-callable
  "List all FindingTypeStats under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListFindingTypeStatsRequest request = ListFindingTypeStatsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListFindingTypeStatsResponse> future = webSecurityScannerClient.listFindingTypeStatsCallable().futureCall(request);
     // Do something
     ListFindingTypeStatsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingTypeStatsCallable))))

(defn list-crawled-urls
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     for (CrawledUrl element : webSecurityScannerClient.listCrawledUrls(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanRunName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanRunName parent]
    (-> this (.listCrawledUrls parent))))

(defn get-settings
  "returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings`"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings [^WebSecurityScannerClient this]
    (-> this (.getSettings))))

(defn list-findings-callable
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .setFilter(filter)
       .build();
     while (true) {
       ListFindingsResponse response = webSecurityScannerClient.listFindingsCallable().call(request);
       for (Finding element : response.getFindingsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingsCallable))))

(defn get-scan-run-callable
  "Gets a ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName name = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     GetScanRunRequest request = GetScanRunRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.getScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getScanRunCallable))))

(defn get-finding
  "Gets a Finding.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     FindingName name = FindingName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\", \"[FINDING]\");
     Finding response = webSecurityScannerClient.getFinding(name);
   }

  name - Required. The resource name of the Finding to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}/findings/{findingId}'. - `com.google.cloud.websecurityscanner.v1alpha.FindingName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.Finding`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.Finding [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.FindingName name]
    (-> this (.getFinding name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStub`"
  ([^WebSecurityScannerClient this]
    (-> this (.getStub))))

(defn get-scan-config
  "Gets a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanConfig response = webSecurityScannerClient.getScanConfig(name);
   }

  name - Required. The resource name of the ScanConfig to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfigName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanConfigName name]
    (-> this (.getScanConfig name))))

(defn delete-scan-config-callable
  "Deletes an existing ScanConfig and its child resources.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     DeleteScanConfigRequest request = DeleteScanConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = webSecurityScannerClient.deleteScanConfigCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.deleteScanConfigCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^WebSecurityScannerClient this]
    (-> this (.isShutdown))))

(defn list-scan-configs-callable
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListScanConfigsResponse response = webSecurityScannerClient.listScanConfigsCallable().call(request);
       for (ScanConfig element : response.getScanConfigsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanConfigsCallable))))

(defn list-finding-type-stats
  "List all FindingTypeStats under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListFindingTypeStatsResponse response = webSecurityScannerClient.listFindingTypeStats(parent);
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanRunName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ListFindingTypeStatsResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanRunName parent]
    (-> this (.listFindingTypeStats parent))))

(defn get-finding-callable
  "Gets a Finding.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     FindingName name = FindingName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\", \"[FINDING]\");
     GetFindingRequest request = GetFindingRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Finding> future = webSecurityScannerClient.getFindingCallable().futureCall(request);
     // Do something
     Finding response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.GetFindingRequest,com.google.cloud.websecurityscanner.v1alpha.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getFindingCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^WebSecurityScannerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-crawled-urls-callable
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListCrawledUrlsRequest request = ListCrawledUrlsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListCrawledUrlsResponse response = webSecurityScannerClient.listCrawledUrlsCallable().call(request);
       for (CrawledUrl element : response.getCrawledUrlsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1alpha.ListCrawledUrlsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listCrawledUrlsCallable))))

(defn shutdown
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.shutdown))))

(defn list-findings-paged-callable
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName parent = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .setFilter(filter)
       .build();
     ApiFuture<ListFindingsPagedResponse> future = webSecurityScannerClient.listFindingsPagedCallable().futureCall(request);
     // Do something
     for (Finding element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListFindingsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingsPagedCallable))))

(defn start-scan-run
  "Start a ScanRun according to the given ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanRun response = webSecurityScannerClient.startScanRun(name);
   }

  name - Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfigName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanRun [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanConfigName name]
    (-> this (.startScanRun name))))

(defn start-scan-run-callable
  "Start a ScanRun according to the given ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     StartScanRunRequest request = StartScanRunRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.startScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.StartScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.startScanRunCallable))))

(defn update-scan-config
  "Updates a ScanConfig. This method support partial update of a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     ScanConfig response = webSecurityScannerClient.updateScanConfig(scanConfig, updateMask);
   }

  scan-config - Required. The ScanConfig to be updated. The name field must be set to identify the resource to be updated. The values of fields not covered by the mask will be ignored. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfig`
  update-mask - Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanConfig scan-config ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateScanConfig scan-config update-mask)))
  (^com.google.cloud.websecurityscanner.v1alpha.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.UpdateScanConfigRequest request]
    (-> this (.updateScanConfig request))))

(defn close
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.close))))

(defn list-scan-configs-paged-callable
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListScanConfigsPagedResponse> future = webSecurityScannerClient.listScanConfigsPagedCallable().futureCall(request);
     // Do something
     for (ScanConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanConfigsPagedCallable))))

(defn list-scan-runs
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName parent = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     for (ScanRun element : webSecurityScannerClient.listScanRuns(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanConfigName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanConfigName parent]
    (-> this (.listScanRuns parent))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^WebSecurityScannerClient this]
    (-> this (.isTerminated))))

(defn get-scan-run
  "Gets a ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName name = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ScanRun response = webSecurityScannerClient.getScanRun(name);
   }

  name - Required. The resource name of the ScanRun to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanRunName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanRun [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanRunName name]
    (-> this (.getScanRun name))))

(defn stop-scan-run-callable
  "Stops a ScanRun. The stopped ScanRun is returned.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName name = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     StopScanRunRequest request = StopScanRunRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.stopScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.StopScanRunRequest,com.google.cloud.websecurityscanner.v1alpha.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.stopScanRunCallable))))

(defn list-scan-configs
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (ScanConfig element : webSecurityScannerClient.listScanConfigs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a project resource name in the format 'projects/{projectId}'. - `com.google.cloud.websecurityscanner.v1alpha.ProjectName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ProjectName parent]
    (-> this (.listScanConfigs parent))))

(defn stop-scan-run
  "Stops a ScanRun. The stopped ScanRun is returned.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanRunName name = ScanRunName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ScanRun response = webSecurityScannerClient.stopScanRun(name);
   }

  name - Required. The resource name of the ScanRun to be stopped. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `com.google.cloud.websecurityscanner.v1alpha.ScanRunName`

  returns: `com.google.cloud.websecurityscanner.v1alpha.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1alpha.ScanRun [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1alpha.ScanRunName name]
    (-> this (.stopScanRun name))))

(defn create-scan-config-callable
  "Creates a new ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     CreateScanConfigRequest request = CreateScanConfigRequest.newBuilder()
       .setParent(parent.toString())
       .setScanConfig(scanConfig)
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.createScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1alpha.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.createScanConfigCallable))))

(defn shutdown-now
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.shutdownNow))))

(defn list-scan-runs-callable
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfigName parent = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ListScanRunsRequest request = ListScanRunsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListScanRunsResponse response = webSecurityScannerClient.listScanRunsCallable().call(request);
       for (ScanRun element : response.getScanRunsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1alpha.ListScanRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanRunsCallable))))

