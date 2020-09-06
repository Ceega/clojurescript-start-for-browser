(ns clojurescript-start-for-browser.core)

(defn start {:dev/after-load true} []
  (js/console.log "Hello world!"))

(defn init []
  (start))
