/*
 * 				Twidere - Twitter client for Android
 * 
 *  Copyright (C) 2012-2014 Mariotaku Lee <mariotaku.lee@gmail.com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.fragment.support;

import android.os.Bundle;
import android.support.v4.content.Loader;

import org.mariotaku.twidere.loader.support.IntentExtrasStatusesLoader;
import org.mariotaku.twidere.model.ParcelableStatus;

import java.util.List;

public class StatusesListFragment extends ParcelableStatusesFragment {

    @Override
    public Loader<List<ParcelableStatus>> onCreateLoader(final int id, final Bundle args) {
        return new IntentExtrasStatusesLoader(getActivity(), getArguments(), getAdapterData());
    }

    @Override
    protected String[] getSavedStatusesFileArgs() {
        return null;
    }

//    @Override
//    protected boolean shouldShowAccountColor() {
//        final List<ParcelableStatus> data = getData();
//        if (data != null) {
//            long account_id = -1;
//            for (final ParcelableStatus status : data) {
//                final long prev = account_id;
//                account_id = status.account_id;
//                if (prev > 0 && account_id != prev) return true;
//            }
//        }
//        return false;
//    }

}
