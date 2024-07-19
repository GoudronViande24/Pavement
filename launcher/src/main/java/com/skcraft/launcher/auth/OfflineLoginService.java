/*
 * SK's Minecraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher.auth;

import lombok.RequiredArgsConstructor;

/**
 * Creates offline sessions.
 */
@RequiredArgsConstructor
public class OfflineLoginService implements LoginService {

    private final String clientId;

    public Session login(String id) {
        return new SavedOfflineSession(clientId);
    }

    @Override
    public Session restore(SavedSession savedSession) {
        return new SavedOfflineSession(savedSession.getUsername());
    }

}
