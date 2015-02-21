(ns steam.game-servers (:require [steam.request :as r]))

(def
 account-list-v1
 "Gets a list of game server accounts with their logon tokens

Parameters:
(string) :key - Access key"
 (partial r/get "IGameServersService" "GetAccountList" 1))

(def account-list account-list-v1)

(def
 create-account-v1
 "Creates a persistent game server account

Parameters:
(string) :key - Access key
(uint32) :appid - The app to use the account for
(string) :memo - The memo to set on the new account"
 (partial r/post "IGameServersService" "CreateAccount" 1))

(def create-account create-account-v1)

(def
 set-memo-v1
 "This method changes the memo associated with the game server account. Memos do not affect the account in any way. The memo shows up in the GetAccountList response and serves only as a reminder of what the account is used for.

Parameters:
(string) :key - Access key
(uint64) :steamid - The SteamID of the game server to set the memo on
(string) :memo - The memo to set on the new account"
 (partial r/post "IGameServersService" "SetMemo" 1))

(def set-memo set-memo-v1)

(def
 reset-login-token-v1
 "Generates a new login token for the specified game server

Parameters:
(string) :key - Access key
(uint64) :steamid - The SteamID of the game server to reset the login token of"
 (partial r/post "IGameServersService" "ResetLoginToken" 1))

(def reset-login-token reset-login-token-v1)

(def
 account-public-info-v1
 "Gets public information about a given game server account

Parameters:
(string) :key - Access key
(uint64) :steamid - The SteamID of the game server to get info on"
 (partial r/get "IGameServersService" "GetAccountPublicInfo" 1))

(def account-public-info account-public-info-v1)

(def
 server-steam-ds-by-ip-v1
 "Gets a list of server SteamIDs given a list of IPs

Parameters:
(string) :key - Access key
(string) :server_ips"
 (partial r/get "IGameServersService" "GetServerSteamIDsByIP" 1))

(def server-steam-ds-by-ip server-steam-ds-by-ip-v1)

(def
 server-ps-by-steam-id-v1
 "Gets a list of server IP addresses given a list of SteamIDs

Parameters:
(string) :key - Access key
(uint64) :server_steamids"
 (partial r/get "IGameServersService" "GetServerIPsBySteamID" 1))

(def server-ps-by-steam-id server-ps-by-steam-id-v1)
